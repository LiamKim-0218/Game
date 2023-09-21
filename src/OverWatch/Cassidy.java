package OverWatch;

public class Cassidy {
	String name = "Cole Cassidy";
	String nameKorean = "콜 캐서디";
	String alias = "Jesse McCree";
	String aliasKorean = "제시 맥크리";
	String gender = "남성";
	int age = 37;
	String agentNumber = "3945 45";
	String prevJob = "갱단 두목(이전 기록)";
	String prevJob1 = "블랙워치 요원(이전 기록)";
	String job = "현상금 사냥꾼";
	String nationality = "미국";
	int height = 185;
	String prevBaseOfActivity = "미국,뉴멕시코,산타페(이전 기록)";
	String baseOfActivity = "감시기지: 지브롤터";
	String prevBelong = "데드락(이전 기록)";
	String prevBelong1 = "블랙워치(이전 기록)";
	String belong = "오버워치";
	String prize = "2500만 달러 이상";
	String SymbolicColor = "#A62927 Color #D3706D sRGB Color";

	// 지속 능력
	class Sustainability {
		String SustainabilityExplain = "적을 처치하면 일시적으로 재장전 속도가 대폭 증가합니다.";
		// 지속 시간 : 처치 후 2.5초
		double SustainabilityDuration = 2.5;
		// 재장전 속도 증가 : 35%
		int SustainabilityIncreasedReloadSpeed = 35;
	}

	// 궁극기 게이지 (내가 만든 임의의 변수 나중에 궁극기 충전량과 어떻게 할지 생각해야함)
	class Ultimate {
		int ultimate = 0;
	}

	// 기본 무기
	class PeaceKeeper {

		String PeaceKeeperExplain = "마우스 좌클릭 강력하고 정확도 높은 리볼버입니다.";
		String PeaceKeeperExplain1 = "마우스 우클릭 남은 총알을 빠르게 난사합니다.";
		// 탄환 수
		int PeaceKeeperShot = 6;
		// 재장전 시간
		double PeaceKeeperDuration = 1.5;

		String PeaceKeeperExplain_Sub = "[좌클릭 - 단발] 공격 유형: 히트스캔";
		// 공격력: 발당 70(25m)~21(35m)
		double PeaceKeeperAttackPower = 70;
		// 공격 속도: 0.5초당 1발(초당 2발, DPS: 140)
		double PeaceKeeperAttackSpeed = 2;
		// 치명타 판정 : 있음(2배)
		int PeaceKeeperCriticalStrike = 2;

		String explain1_Sub = "[우클릭 - 난사] 공격 유형: 히트스캔";
		// 공격력: 공격력: 발당 50(25m)~15(35m)
		double attack1_Power = 50;
		// 공격 속도: 0.12초당 1발(초당 8.33발, DPS: 416.66)
		float attack1_Speed = (float) 8.33;
		// 치명타 판정 : 없음
		int CriticalStrike1 = 0;

	}

	// 생명력(내가 만든거)
	public void WidowmakerHP() {
		int vitality = 225;
		double HP = vitality;
	}

	// 좌Shift - 구르기
	class CombatRoll {
		String explain = "이동 중인 방향으로 구르며 받는 피해가 감소하고 재장전합니다.";
		// 재사용 대기시간 6초
		int cooldownTime = 6;
		// 지속 시간: 0.4초
		float shiftDuration = (float) 0.4;
		// 받는 피해 감소: 50%
		int damageTakenReduction = 50;
//이동 거리: 최대 6m
		int travelDistance = 6;
		// 이동 속도: 15m/s
		int speed = 15;
	}

	// E - 자력 수류탄
	class MagneticGrenade {
		String explain = "주위 적을 추적하며 부착되는 수류탄을 던집니다. 수류탄이 부착된 적은 느려지며 이동 기술을 사용할 수 없습니다.";
		// 공격 유형
		String attackType = "투사체(낙차 있음,폭발형)";
		// 재사용 대기시간 10초
		int CooldownTime = 10;
		// 폭발 대기시간: 부착 후 1.2초
		float explosionWaitingTime = (float) 1.2;
		// 이동 시간: 최대 1.5초
		float travelTime = (float) 1.5;
		// 공격력: 10(부착), 17.5~70(폭발)
		int attackPowerAttached = 10;
		float attackPowerExplosive = (float) 17.5;
		// 자가 피해: 8.75~35(폭발)
		float selfDamage = (float) 8.75;
		// 투사체 속도: 20m/s
		int projectileSpeed = 20;
		// 유도 활성화 거리: 1.3m
		float inductionActivationDistance = (float) 1.3;
		// 유도 시간: 최대 0.75초
		float inductionTime = (float) 0.75;
		// 부착 중 이동 속도 감소: 25%(적)
		int movementSpeedReductionWhileAttached = 25;
		// 폭발 범위: 반경 3m
		int blastRange = 3;
		// 치명타 없음
		int CriticalStrike = 0;
	}

	// Q - 황야의 무법자
	class Deadeye {
		String explain = "적들과 정면승부합니다. (조준: Q, 발사: 마우스 좌클릭 또는 Q, 취소: 마우스 우클릭 )";
		// 공격 유형
		String attackType = "히트스캔";
		// 궁극기 충전량: 1850 포인트
		double UltimateChargeAmount = 2500;
		// 시전 시간: 0.2초
		float castTime = (float) 0.2;
		// 지속 시간: 최대 7초 (누르고 있을때랑 7초 전에 뗄 때 생각해야함)
		int UltimateDuration = 7;
		// 공격력: 조준 시간 처음 2초 동안 초당 130씩 증가, 이후 초당 260씩 증가 (이것도 2초전에 끊는거 생각)
		int ultimateAttackPower = 130;
		// 공격 속도: 초당 6발
		int ultimateAttackSpeed = 6;
		// 이동 속도 감소: 65%(본인, 1.925m/s)
		int ultimateMovementSpeedReduction = 65;
		// 받는 피해 감소: 40%
		int damageReduction = 40;
		// 최대 거리: 200m(이것도 거리비례해서 봐야함)
		int maximumDistance = 200;
		// 치명타 판정: 없음
		int criticalHit = 0;

	}

}
