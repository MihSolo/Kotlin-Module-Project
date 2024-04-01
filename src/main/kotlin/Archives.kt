class Archive(titel: String) {
    val titel = titel
    var noteList = mutableListOf<Notes>()
    fun addMoreNote(titel: String, text: String) {
        var note: Notes = Notes(titel, text)
        noteList.add(note)
    }

    fun readNoteList() {
        if (noteList.isNotEmpty()) {
            for ((index, note) in noteList.withIndex()) {
                println("${index + 1} ${note.titel} ${note.text}")
            }
        } else {
            println("заметок не найдено")
        }
    }

    fun writeMore(noteIndex: Int, text: String) {
        noteList[noteIndex].text = noteList[noteIndex].text + text
    }

    fun readOneNote(noteIndex: Int): String {
        return noteList[noteIndex].readNote()
    }
}