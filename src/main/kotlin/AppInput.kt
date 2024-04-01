import java.util.Scanner

class AppInput {

    fun stringInput(scanner: Scanner): String {
        while (scanner.hasNextLine().not()) {
            println("Вы должны ввести строку.")
            scanner.next()
        }
        return scanner.nextLine()
    }

    fun integerInput(scanner: Scanner): Int {
        while (scanner.hasNextInt().not()) {
            println("Вы должны ввести цифру.")
            scanner.next()
        }
        return scanner.nextInt()
    }

}