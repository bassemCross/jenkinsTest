import jobs.*

job('test') {
    steps {
        shell("echo 'just one step'")
    }
}