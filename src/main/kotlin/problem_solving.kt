fun main(args: Array<String>) {

    // C  -> 1000011 -> 0 0 00 0000 0 00

    val MESSAGE:String  = "C"

    val messageInBinaryRep = convertStringToBinaryRep(MESSAGE)

    println(messageInBinaryRep)

    var messageInBSRep = ""
    var index = 0
    for((index, letter) in messageInBinaryRep.withIndex()) {
        if(letter == '1'){
            messageInBSRep += "0 "

            var i = index
            while (messageInBSRep.length > index && messageInBinaryRep[i] != '0'){
                messageInBSRep += "0"
                i++
            }
        }

        if(letter == '0'){
            messageInBSRep += "00 "

            var i = index
            while (messageInBSRep.length > index && messageInBinaryRep[i] != '1'){
                messageInBSRep += "0"
                i++
            }
        }

        if(index != messageInBinaryRep.length)messageInBSRep += " "

    }

println(" Result : $messageInBSRep")


}

fun convertStringToBinaryRep(str : String) : String = str.map{convertCharToBinaryRep(it)}.joinToString()

fun convertCharToBinaryRep(c: Char): String = c.code.toString(2)