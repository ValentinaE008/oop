enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    var id: Int = 0,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Long,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: Long,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Boolean
)

data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

data class Copyright(
    val id: Long,
    val link: String,
    val name: String,
    val type: String
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: String,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

data class Reposts(
    val count: Long,
    val userReposted: Boolean
)

data class Views(val count: Long)