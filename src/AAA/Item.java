package AAA;
public class Item {
    private String name;
    private int effect;

    public Item(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getEffect(Player player) {
    	return effect;
    }

    public void use(Player player) {
        // 아이템을 사용하면 플레이어의 속성에 효과를 적용
    	player.setHealth(player.getHealth() + effect);
        System.out.println(player.getName() + "이(가) " + name + "을(를) 사용했습니다. 체력이 " + effect + " 증가했습니다.");
    }
    public void use1(Player player) {
        // 아이템을 사용하면 플레이어의 속성에 효과를 적용
    	player.setAttack(player.getAttack() + effect);
        System.out.println(player.getName() + "이(가) " + name + "을(를) 사용했습니다. 공격력이 " + effect + " 증가했습니다.");
    }
    
}