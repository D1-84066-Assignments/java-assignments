import java.util.*;

interface Batter {
    int getRuns();
}

interface Bowler {
	int getWickets();
}

abstract class Player {
	int id ;
	String name;
	int  age; 
	int matchesPlayed;
	
	
	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}


	public void accept(Scanner sc) {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || !(obj instanceof Player)) {
	            return false;
	        }
	        Player other = (Player) obj;
	        return this.id == other.id;
	    }
	 @Override
	    public String toString() {
	        return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	    }
	
}


class Cricketer extends Player implements Batter, Bowler {
    private int runs;
    private int wickets;

    public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
        super(id, name, age, matchesPlayed);
        this.runs = runs;
        this.wickets = wickets;
    }

    @Override
    public int getRuns() {
        return runs;
    }

    @Override
    public int getWickets() {
        return wickets;
    }

    @Override
    public void accept(Scanner sc) {
        System.out.println("Enter cricketer's name:");
        this.name = sc.nextLine();

        System.out.println("Enter age:");
        this.age = sc.nextInt();

        System.out.println("Enter matches played:");
        this.matchesPlayed = sc.nextInt();

        System.out.println("Enter total runs:");
        this.runs = sc.nextInt();

        System.out.println("Enter total wickets:");
        this.wickets = sc.nextInt();
        
        sc.nextLine(); 
    }

    @Override
    public String toString() {
        return "Cricketer [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + 
               ", runs=" + runs + ", wickets=" + wickets + "]";
    }
}


public class CricketTeam {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter no. of  player " );
	        int p = sc.nextInt();
	        List<Cricketer> team = new ArrayList<>(p);
	        for (int i = 0; i < p; i++) {
	            System.out.println("Enter details for player " + (i + 1));
	            Cricketer cricketer = new Cricketer(i + 1, "", 0, 0, 0, 0);
	            cricketer.accept(sc);
	            team.add(cricketer);
	        }

	       
	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Display total runs of all players");
	            System.out.println("2. Display total wickets taken by all players");
	            System.out.println("3. Display total matches played");
	            System.out.println("4. Display all cricketers with their name and matches played");
	            System.out.println("5. Exit");
	            
	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    int totalRuns = team.stream().mapToInt(Cricketer::getRuns).sum();
	                    System.out.println("Total runs of all players: " + totalRuns);
	                    break;

	                case 2:
	                    int totalWickets = team.stream().mapToInt(Cricketer::getWickets).sum();
	                    System.out.println("Total wickets taken by all players: " + totalWickets);
	                    break;

	                case 3:
	                    int totalMatches = team.stream().mapToInt(Cricketer::getMatchesPlayed).sum();
	                    System.out.println("Total matches played by all players: " + totalMatches);
	                    break;

	                case 4:
	                    System.out.println("All cricketers with their name and matches played:");
	                    team.forEach(cricketer -> 
	                        System.out.println("Name: " + cricketer.getName() + ", Matches Played: " + cricketer.getMatchesPlayed())
	                    );
	                    break;

	                case 5:
	                    System.out.println("Exiting program.");
	                    return;

	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	        }
	    }
}


