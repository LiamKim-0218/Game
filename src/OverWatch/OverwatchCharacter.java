package OverWatch;

public class OverwatchCharacter {
    String name;
    String nameKorean;
    String alias;
    String aliasKorean;
    String gender;
    int age;
    String agentNumber;
    String prevJob;
    String prevJob1;
    String job;
    String nationality;
    int height;
    String prevBaseOfActivity;
    String baseOfActivity;
    String prevBelong;
    String prevBelong1;
    String belong;
    String prize;
    String SymbolicColor;

    class Sustainability {
        String explain;
        double duration;
        int IncreasedReloadSpeed;
    }

    class Ultimate {
        int ultimate;
    }

    class PeaceKeeper {
        String explain;
        String explain1;
        int shot;
        double duration;
        String explain_Sub;
        double attackPower;
        double attackSpeed;
        int CriticalStrike;
        String explain1_Sub;
        double attack1_Power;
        float attack1_Speed;
        int CriticalStrike1;
    }

    public OverwatchCharacter(
            String name, String nameKorean, String alias, int age, String agentNumber, String prevJob, String prevJob1, int height, String prevBaseOfActivity, String baseOfActivity,
            String prevBelong, String prevBelong1) {
        this.name = name;
        this.nameKorean = nameKorean;
        this.alias = alias;
        this.aliasKorean = aliasKorean;
        this.gender = gender;
        this.age = age;
        this.agentNumber = agentNumber;
        this.prevJob = prevJob;
        this.prevJob1 = prevJob1;
        this.job = job;
        this.nationality = nationality;
        this.height = height;
        this.prevBaseOfActivity = prevBaseOfActivity;
        this.baseOfActivity = baseOfActivity;
        this.prevBelong = prevBelong;
        this.prevBelong1 = prevBelong1;
        this.belong = belong;
        this.prize = prize;
        this.SymbolicColor = SymbolicColor;
    }

	public OverwatchCharacter(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, int i, String string10, String string11,
			String string12, String string13) {
		// TODO Auto-generated constructor stub
	}

}
