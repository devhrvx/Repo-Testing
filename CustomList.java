class CustomList {

	private ArrayList<String> list = new ArrayList<String>();
	private Scanner input = new Scanner(System.in);

	void insert() {
		System.out.print("\nInsert element to list: ");
		String i = input.next();
		if (list.contains(i)) {
			System.out.println("\nElement is already on the list.");
		} else {
			list.add(i);
		}
	}

	void remove() {
		System.out.print("\nRemove element from list: ");
		String i = input.next();
		if (list.contains(i)) {
			list.remove(i);
			System.out.println("\n" + i + " is removed from the list.");
		} else {
			System.out.println("\n" + i + " is not found on the list.");
		}
	}

	void getRandom() {
		Random random = new Random();
		if (list.isEmpty()) {
			System.out.println("\nUnsuccessful. The list is empty.");
		} else {
			System.out.println("\nRandomly got: " + list.get(random.nextInt(list.size())));
		}
	}

	void replaceElem() {
		System.out.print("\nReplace: ");
		String i = input.next();
		System.out.print("Replace " + i + " with: ");
		String j = input.next();
		if (list.contains(i) && !list.contains(j)) {
			int indexI = list.indexOf(i);
			list.set(indexI, j);
			System.out.println("\nSuccessfully replaced: " + i + " to " + j);
		} else {
			System.out.println("\nUnsuccessful. " + i + " is not found or already on the list.");
		}
	}

	void displayList() {
		System.out.println("\nList: " + list);
	}
}