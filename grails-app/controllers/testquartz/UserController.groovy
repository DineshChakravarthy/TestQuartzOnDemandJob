package testquartz

class UserController {

    def index() { 
    	println "running the job"
    	TaskReminderJob.triggerNow([name:"frank",email:"frank@test.com"] )
    	render "Done"
    }
}
