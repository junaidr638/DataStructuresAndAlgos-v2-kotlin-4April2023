package LaunchPad

infix fun String.example(function:()->Unit ){
    println(".......... $this ..........")
    function()
    println()


}