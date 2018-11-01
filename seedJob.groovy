import jobs.*

job('job name') {
    steps {
        shell("echo 'just one step'")
    }
}