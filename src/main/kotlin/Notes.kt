class Notes(var titel: String, var text: String) {

    fun readNote(): String {
        return text
    }

    fun continueNote(newText: String) {
        text = text + newText
    }
}