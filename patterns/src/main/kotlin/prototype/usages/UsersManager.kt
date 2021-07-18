package prototype.usages

import prototype.usages.users.Administrator
import prototype.usages.users.Moderator
import prototype.usages.users.Viewer
import java.util.*

class UsersManager {
    private var usersPrototypes: HashMap<String, IUserPrototype>? = null

    init {
        initializePrototypes()
    }

    private fun initializePrototypes() {
        usersPrototypes = HashMap<String, IUserPrototype>()
        createAdministratorPrototype()
        createModeratorPrototype()
        createViewerPrototype()
        createBlockedViewerPrototype()
    }

    private fun createAdministratorPrototype() {
        usersPrototypes!!["administrator"] = Administrator()
    }

    private fun createModeratorPrototype() {
        usersPrototypes!!["moderator"] = Moderator()
    }

    private fun createViewerPrototype() {
        usersPrototypes!!["viewer"] = Viewer()
    }

    private fun createBlockedViewerPrototype() {
        val blockedViewer = Viewer()
        blockedViewer.isBlocked = true
        usersPrototypes!!["blocked_viewer"] = blockedViewer
    }

    fun createAdministrator(): IUserPrototype {
        println("Create Administrator from prototype")
        return usersPrototypes!!["administrator"]!!.shallowClone()
    }

    fun createModerator(): IUserPrototype {
        println("Create Moderator from prototype")
        return usersPrototypes!!["moderator"]!!.shallowClone()
    }

    fun createViewer(blocked: Boolean = false): IUserPrototype {
        println("Create Viewer from prototype")
        return if (blocked){
            usersPrototypes!!["blocked_viewer"]!!.shallowClone()
        }else{
            usersPrototypes!!["viewer"]!!.shallowClone()
        }
    }
}

fun main() {
    UsersManager().apply {
        createAdministrator()
        createModerator()
        createViewer(false)
        createViewer(true)
    }
}