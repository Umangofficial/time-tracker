def buildApp(){
    echo 'Building the application...'
}

def testApp(){
    echo 'Testing the application...'
}

def deployApp(){
    echo 'Deploying....'
    echo "Deploying version ${params.VERSION}"
}

return this
