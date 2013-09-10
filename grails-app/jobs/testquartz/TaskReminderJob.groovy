package testquartz



class TaskReminderJob {

	static triggers = { }

	def execute(context) {
		println "The job is running..."
		def email = context.mergedJobDataMap.get('email')
		def name = context.mergedJobDataMap.get('name')
		println "receiving data ---> email is:$email, name is:$name"
        println "doing some work"  
     }

 }
