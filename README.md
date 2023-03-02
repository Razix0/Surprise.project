# Surprise.project
The types of surprises are the following:
FortuneCookie
Candies
MinionToy
All the surprises will be stored in various types of containers, which will dictate the storage method and especially the order in which the surprises will be distributed . 
Since we want to operate with any type of container in a transparent , implementation-independent way, we will use an interface that will define the concrete communication protocol.
The following types of "surprise quivers" are implemented:
A quiver that will give the gifts inside in a random order
A quiver that will give gifts in the order they were entered (a strategy called FIFO )
A quiver that will give the gifts in reverse order of introduction (strategy called LIFO )
To generate a set of random surprises , we will implement a "special" class, GatherSurpriseswhich
Since there are several types of containers, we want to implement a unique mechanism to spawn a new (empty) container. Such a programming template (eng: design pattern ) is one often used in programming and is called the Factory Pattern
But what is the point of all this without the joy of giving ?
We will implement a mechanism to share the surprises, in 3 possible ways
