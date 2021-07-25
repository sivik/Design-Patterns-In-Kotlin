package factory.approaches

import java.io.Console


enum class ProductType {
    Product01, Product02
}

fun main() {
    ProductFactory.createProduct(ProductType.Product01).doSth()
    ProductFactory.createProduct(ProductType.Product02).doSth()
}
