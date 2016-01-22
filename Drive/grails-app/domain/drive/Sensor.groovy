package drive

class Sensor {
	
	static belongsTo = [journey: Journey]
	static hasMany = [points : Point]
	
	String name
	String description

    static constraints = {
		name()
		description()
    }
}
