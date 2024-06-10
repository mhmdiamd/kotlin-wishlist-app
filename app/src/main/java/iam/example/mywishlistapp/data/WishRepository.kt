package iam.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(
    private val wishDao : WishDao
) {
    suspend fun addWish(wish: Wish) {
        wishDao.addWish(wish)
    }

    suspend fun updateAWish(wish: Wish) {
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish: Wish) {
        wishDao.deleteAWish(wish)
    }

    fun getWishes() : Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id : Long) : Flow<Wish> {
        return wishDao.getAWishById(id)
    }

}