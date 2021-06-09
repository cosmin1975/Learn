package advancedOOP;

/**
 * Exemplu compunere
 */
public class ExComposition {
    public static void main(String[] args) {
        Company tBit = new Company(6);
        tBit.getTeam();
    }
}

class PersonA {
    String name;
    int age;

    PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Company {
    PersonA team[]; // Compunere!!!
    int teamSize;

    Company(int teamSize) {
        this.teamSize = teamSize;

        team = new PersonA[teamSize];

        for (int i = 0; i < teamSize; i++) {
            String tmpName = "Employee" + i;
            team[i] = new PersonA(tmpName, 24 + i);
        }
    }

    public int getTeamSize() {
        return this.teamSize;
    }

    public void getTeam() {
        for (int i = 0; i < this.teamSize; i++) {
            System.out.println(team[i]);
        }
    }
}

