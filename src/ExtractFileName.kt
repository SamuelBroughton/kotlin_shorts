/*
    Kata
    ====

    You have to extract a portion of the file name as follows:

    - Assume it will start with date represented as long number
    - Followed by an underscore
    - You'll have then a filename with an extension
    - it will always have an extra extension at the end

    Example Inputs
    ==============

    - 1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
    - 1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
    - 1231231223123131_myFile.tar.gz2

    Example Outputs
    ===============

    - FILE_NAME.EXTENSION
    - This_is_an_otherExample.mpg
    - myFile.tar
 */

fun extractFileName(dirtyFileName: String): String {
    val underScoreSplit: List<String> = dirtyFileName.split('_')
    val fileNoNumber = underScoreSplit
        .drop(1)
        .joinToString("_")
    val fullStopSplit: List<String> = fileNoNumber.split('.')
    return fullStopSplit[0] + "." + fullStopSplit[1]
}