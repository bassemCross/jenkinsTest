import jobs.*

job('created test') {
    steps {
        shell("echo 'just one step'")
    }
}