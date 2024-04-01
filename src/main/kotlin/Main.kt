import java.util.Scanner
import Archive
fun main(args: Array<String>) {
    var archiveList = mutableListOf<Archive>()
    var scanner: Scanner = Scanner(System.`in`)
    var menu = Menu()
    var inputControl = AppInput()
    var appNavi = AppNavigation()
    appNavi.appNavi(inputControl, menu, scanner, archiveList)

}

