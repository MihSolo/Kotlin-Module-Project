import java.util.Scanner
import Archive

fun main(args: Array<String>) {
    var archiveList = mutableListOf<Archive>()
    var scanner: Scanner = Scanner(System.`in`)
    var menu = Menu()
    var inputControl = AppInput()
    var appNavi = AppNavigation()
    appNavi.appNavi(inputControl, menu, scanner, archiveList)





//    var mark: Boolean = true
//    var mark2: Boolean = true
//    var mark3:Boolean = true


//    while (mark) {
//        menu.mainScreeenMenu()
//        var choise = inputControl.integerInput(scanner)
//        when (choise) {
//            1 -> {
//                mark2 = true
//                println("Введите название архива.")
//                scanner = Scanner(System.`in`)
//                var name = inputControl.stringInput(scanner)
//                archiveList.add(Archive(name))
//                println("Архив создан.")
//                // return
//            }
//
//            2 -> {
//                mark2 = true
//                println("Список созданных архивов:")
//                for ((index, archive) in archiveList.withIndex()) {
//                    println("${index + 1} ${archive.titel}")
//                }
//                //  menu.allArchiveMenu()
//                println("Введите номер архива, который надо открыть:")
//                scanner = Scanner(System.`in`)
//                choise = inputControl.integerInput(scanner)
//                if (archiveList.size >= choise) {
//                    println("Архив ${archiveList[choise - 1].titel} открыт")
//                    //..............................
//                    while (mark2) {
//                        menu.newArchiveMenu()
//                        println("Введите номер действия:")
//                        scanner = Scanner(System.`in`)
//                        var choiseForNote = inputControl.integerInput(scanner)
//                        when (choiseForNote) {
//                            1 -> {
//                                mark3 = true
//                                println("Введите название.")
//                                scanner.nextLine()
//                                var name = inputControl.stringInput(scanner)
//                                println("Введите текст заметки")
//                                scanner = Scanner(System.`in`)
//                                var str = inputControl.stringInput(scanner)
//                                archiveList[choise - 1].addMoreNote(name, str)
//                                println(archiveList[choise - 1].noteList.size)  //----------------------------------
//                            }
//
//                            2 -> {
//                                mark3 = true
//                                println("Список заметок архива ${archiveList[choise - 1].titel}")
//                                if (archiveList[choise - 1].noteList.size > 0) {
//                                    archiveList[choise - 1].readNoteList()
//                                    println("Введите номер заметки для её просмотра")
//                               //     while (mark3){
//                                    //    menu.noteMenu()
//                                    scanner = Scanner(System.`in`)
//                                    var noteChoise = inputControl.integerInput(scanner)
//                                    if (archiveList[choise - 1].noteList.size >= noteChoise) {
//                                        println("Заметка: ${archiveList[choise - 1].noteList[noteChoise - 1].titel}")  //тут можно вывести название или текст
//                                        ///esli nado dopolnitj zametku
//                                        while(mark3) {
//                                            menu.noteMenu()
//                                            println("введите нужный номер")
//                                            scanner = Scanner(System.`in`)
//                                            var noteChangeNum = inputControl.integerInput(scanner)
//                                            when(noteChangeNum){
//                                                1 -> {
//                                                    println("Заметка: ${archiveList[choise - 1].noteList[noteChoise - 1].text}")
//                                                }
//                                                2 ->{
//                                                    println("Введите дополнительный текст")
//                                                    scanner = Scanner(System.`in`)
//                                                    var strForNote = inputControl.stringInput(scanner)
//                                                    archiveList[choise - 1].noteList[noteChoise - 1].continueNote(strForNote)
//                                                }
//                                                3 ->{
//                                                    mark3 = false
//                                                }
//                                            }
//                                        }
//                                    }
//                            //    }//------------------------------mark3
//                                } else {
//                                    println("В даннос архиве пока-что заметок нет.")
//                                }
//                            }
//
//                            3 -> {
//                                mark2 = false
//                                //  return   //  ?????????
//                            }
//
//                        }
//                    }      //---------------------->
//                } else {
//                    println("Данного архива не существует..")
//                }
//
//            }
//
//            3 -> return
//            //    else -> println("........")
//        }
//
//
//    }


}

