public abstract class Shape {
	abstract void Draw();
	abstract String getType();
	
	private String typeOrderTable[] =
	{
		"square",
		"circle",
		""
	};

	boolean Preceeds(Shape shape) {
		String thisType = this.getType();
		String argType = shape.getType();
		boolean done = false;
		int thisOrd = -1;
		int argOrd = -1;
		for (int i=0; !done ; i++) {
			String tableEntry = typeOrderTable[i];
			if (!tableEntry.equals("")) {
				if (tableEntry.equals(thisType))
					thisOrd = i;
				if (tableEntry.equals(argType))
					argOrd = i;
				if ((argOrd >= 0) && (thisOrd >= 0))
					done = true;
			} else { // table entry == ""
				done = true;
			}
		}
		return thisOrd < argOrd;
	}
}
