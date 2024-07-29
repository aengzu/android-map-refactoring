package campus.tech.kakao.map.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "search_queries")
data class SearchQueryEntity(
    @PrimaryKey val query: String
)
