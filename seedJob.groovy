import jobs.*

// common for all projects
def prefix = "${PREFIX}"
def gitURL = "${GIT_URL}"

job('test') {
    steps {
        echo 'steps'
    }
}