# Music

I am studying in Java-begin courses.
Create a playlist, add songs to it and play them.

Entities:

1) Playlist (Playlist) – a container that will contain all the songs
– the “songList” property – a list of available songs – the ArrayList collection
– the “addSong” method – add a new song to the songList
– the “playAllSongs” method – plays all the Song songs in turn by the play method

2) Song (Song) – an object that we will add to the songList collection –
the “name” property: the song name – String
– the “author” property: a reference to the Author object
– the “play” method: play the current song – outputs to the console: the name of the song and the name of the author

3) The author of the song (Author) – you can use a regular class (without an interface), which is conventionally called POJO (Plain Old Java Object) – just contains properties without methods
– the “name” property: name – String

Conditions:
When playing a song, the following should be displayed: “The song is playing title, author author“

Launch
Creating objects:

playlist
any number of Song objects
We add the created Song songs alternately to the playlist using the addSong method.
We play all the songs from the playlist using the playAllSongs method (which runs through all the elements of the songList collection using a loop and calls the play method for each song)

Example of output to the console after program execution:

Играет песня: Щелкунчик, автор: Чайковский
Играет песня: Лебединое озеро, автор: Чайковский
Играет песня: Времена года, автор: Вивальди
Играет песня: Цвет настроения синий, автор: Киркоров
Играет песня: Shape of My Heart, автор: Sting
Играет песня: Show must go on, автор: Queen
Играет песня: We will rock you, автор: Queen
