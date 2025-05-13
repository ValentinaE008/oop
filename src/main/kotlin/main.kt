fun main() {

    val comments1 = Comments(
        900,
        true,
        true,
        true,
        true
    )

    val copyright1 = Copyright(
        333,
        "www.111.ru",
        "K",
        "rights",
    )

    val likes1 = Likes(
        1100,
        true,
        true,
        true,
    )

    val donut1 = Donut(
        false,
        444,
        "L",
        true,
        "y"
    )

    val reposts1 = Reposts(
        777,
        true,
    )

    val views1 = Views(450)


    val post1 = Post(
        1,
        123,
        222,
        111,
        250322,
        "Hello world",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy.toString(),
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true
    )

    val post2 = Post(
        1,
        456,
        222,
        111,
        200320,
        "How are you, world?",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy.toString(),
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true
    )

    val post3 = Post(
        1,
        789,
        222,
        111,
        250419,
        "Bye-bye, world",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy.toString(),
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true
    )

    WallService.add(post1)
    WallService.add(post2)
    WallService.update(post3)
    WallService.add(post3)
    WallService.print()
}