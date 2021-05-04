package ae.humaidq.aimod

// For support join https://discord.gg/v6v4pMv
data class PlayerInfo(val x: Float, val y: Float, val z: Float, val faceVert: Float, val faceHor: Float)
data class MinecraftData(val health: Int, var player: PlayerInfo)

@Suppress("unused")
fun init() {
    println("Hello Fabric world!")
}