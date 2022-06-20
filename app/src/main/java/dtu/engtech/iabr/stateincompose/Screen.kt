package dtu.engtech.iabr.stateincompose

sealed class Screen(val route: String){
    object MainScreen: Screen("main_screen")
    object ValgteUdstyrScreen: Screen("ValgteUdstyr_screen")
    object SessionScreen: Screen("Session_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
        //hej med dig - dette er en test
    }
}

