package AdventureRPG;

public class Skill {
   
       private String skillName;
       private int skillPower;
       private int spendMp;
       
       public Skill() {
          
       }

       public String getSkillName() {
           return skillName;
       }

       public void setSkillName(String skillName) {
           this.skillName = skillName;
       }

       public int getSkillPower() {
           return skillPower;
       }

       public void setSkillPower(int skillPower) {
           this.skillPower = skillPower;
       }

       public int getSpendMp() {
           return spendMp;
       }

       public void setSpendMp(int spendMp) {
           this.spendMp = spendMp;
       }

//       public int getAttackPower() {
//           return attackPower;
//       }
//
//       public void setAttackPower(int attackPower) {
//           this.attackPower = attackPower;
//       }
   
}