environments {
	development {
		grails{
			mongo{
				host ="localhost"
				port ="27017"
				databaseName ="Drive"
			}
		}
	}

	test {
		grails{
			mongo{
				host ="localhost"
				port ="27017"
				databaseName ="DriveTest"
			}
		}
	}
}