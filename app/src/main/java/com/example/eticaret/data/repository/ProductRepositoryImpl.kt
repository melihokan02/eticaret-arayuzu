package com.example.eticaret.data.repository

import com.example.eticaret.data.remote.FakeStoreApi
import com.example.eticaret.domain.model.Product
import com.example.eticaret.domain.repository.ProductRepository
import javax.inject.Inject
import kotlin.math.roundToInt

class ProductRepositoryImpl @Inject constructor(
    private val api: FakeStoreApi
) : ProductRepository {

    override suspend fun getProducts(): List<Product> {
        val originalProducts = api.getProducts()
        return originalProducts.take(originalProducts.size / 2).map { translateProduct(it) }
    }

    override suspend fun getProductById(id: Int): Product {
        return translateProduct(api.getProductById(id))
    }

    private fun translateProduct(product: Product): Product {
        val newPrice = ((product.price * 33.0) * 100.0).roundToInt() / 100.0
        
        val newTitle = when (product.id) {
            1 -> "Sırt Çantası"
            2 -> "Erkek Günlük Tişört"
            3 -> "Erkek Rüzgarlık Ceket"
            4 -> "Erkek Uzun Kollu Tişört"
            5 -> "Gümüş Bileklik"
            6 -> "Altın Pırlanta Yüzük"
            7 -> "Prenses Kesim Yüzük"
            8 -> "Çelik Halka Küpe"
            9 -> "Harici Disk 2TB"
            10 -> "Dahili SSD 1TB"
            else -> product.title
        }

        val newDesc = when (product.id) {
            1 -> "Günlük kullanım veya seyahatler için ideal, 15 inç laptop bölmeli şık ve dayanıklı sırt çantası."
            2 -> "Rahat kesim, %100 pamuklu, günlük kullanıma uygun birinci sınıf tişört."
            3 -> "Rüzgar geçirmez, ilkbahar ve sonbahar ayları için mükemmel hafif ceket."
            4 -> "İnce ve nefes alabilen kumaşıyla günlük kullanım için ideal uzun kollu tişört."
            5 -> "Efsanevi Naga koleksiyonundan el yapımı, şık gümüş zincir bileklik."
            6 -> "Özel günler için zarif tasarımlı, küçük pırlanta detaylı altın yüzük."
            7 -> "Nişan ve özel günler için prenses kesim tektaş pırlanta yüzük."
            8 -> "Gül altın kaplama, paslanmaz çelikten üretilmiş zarif çift halka küpe."
            9 -> "USB 3.0 destekli, yüksek hızlı ve taşınabilir 2TB kapasiteli harici disk."
            10 -> "Bilgisayarınızın performansını artıran yüksek hızlı SATA III 1TB dahili SSD."
            else -> product.description
        }
        
        val newCategory = when (product.category) {
            "men's clothing" -> "Erkek Giyim"
            "jewelery" -> "Takı & Mücevher"
            "electronics" -> "Elektronik"
            "women's clothing" -> "Kadın Giyim"
            else -> product.category
        }

        return product.copy(
            title = newTitle,
            description = newDesc,
            price = newPrice,
            category = newCategory
        )
    }
}
