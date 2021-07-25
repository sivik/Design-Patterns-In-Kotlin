package factory.usages.simplefactory


sealed interface Database {
    object MongoDb : Database
}

object PostgreSql : Database
class SQLite(val host: String) : Database
data class Oracle(val host: String) : Database

class Config(
    val connectionString: String
)

object DbConfigFactory {

    fun configForDb(Database: Database): Config =
        when (Database) {
            is PostgreSql -> Config("PostgreSql connection string")
            is SQLite -> Config("SQLite connection string")
            is Database.MongoDb -> Config("MongoDb connection string")
            is Oracle -> Config("Oracle connection string with hostname")
        }
}

fun main() {
    val sqLiteConfig = DbConfigFactory.configForDb(SQLite("192.168.0.1")).connectionString
    val oracleConfig = DbConfigFactory.configForDb(Oracle("192.168.0.1")).connectionString
    val mongoDbConfig = DbConfigFactory.configForDb(Database.MongoDb).connectionString
    val postgreSqlConfig = DbConfigFactory.configForDb(PostgreSql).connectionString
    println("SQLite config: $sqLiteConfig")
    println("Oracle config: $oracleConfig")
    println("MongoDb config: $mongoDbConfig")
    println("PostgreSql config: $postgreSqlConfig")
}
