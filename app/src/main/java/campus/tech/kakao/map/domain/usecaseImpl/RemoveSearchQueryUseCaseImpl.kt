package campus.tech.kakao.map.domain.usecaseImpl

import campus.tech.kakao.map.domain.repository.PlaceRepository
import campus.tech.kakao.map.domain.usecase.RemoveSearchQueryUseCase
import javax.inject.Inject

class RemoveSearchQueryUseCaseImpl @Inject constructor(private val placeRepository: PlaceRepository) :
    RemoveSearchQueryUseCase {
    override suspend fun invoke(query: String) {
        placeRepository.removeSearchQuery(query)
    }

}