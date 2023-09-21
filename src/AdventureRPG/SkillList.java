package AdventureRPG;

import java.util.ArrayList;
import java.util.List;

public class SkillList {
   
   public static final int length = 3;
   private static List<Skill> skills = new ArrayList<>(); // skills를 private static 필드로 정의

   // 스킬을 추가하는 메서드
   public static void addSkill(Skill skill) {
       skills.add(skill);
   }

   // 스킬 리스트를 반환하는 getter 메서드
   public static List<Skill> getSkills() {
       return skills;
   }

   public static void main(String[] args) {
        // 스킬을 저장할 리스트 생성
        List<Skill> skills = getSkills();

        // 스킬 생성 및 설정
        Skill skill1 = new Skill();
        skill1.setSkillName("파이어 볼");
        skill1.setSkillPower(20);
        skill1.setSpendMp(50);
       
        Skill skill2 = new Skill();
        skill2.setSkillName("물 뿌리기");
        skill2.setSkillPower(10);
        skill2.setSpendMp(50);
       
        Skill skill3 = new Skill();
        skill3.setSkillName("썬더");
        skill3.setSkillPower(15);
        skill3.setSpendMp(50);
       
        // 스킬 리스트에 추가
        addSkill(skill1);
        addSkill(skill2);
        addSkill(skill3);

        // 스킬 리스트를 가져올 수 있습니다.
        List<Skill> allSkills = getSkills();
    }

}
