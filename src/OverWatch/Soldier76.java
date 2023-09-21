package OverWatch;

public class Soldier76 extends OverwatchCharacter {
   
	public Soldier76() {
        super("John Francis Jack Morrison", "존 프랜시스 잭 모리슨", "솔저 : 76, 영웅", "남성",
                "불명", "군인(이전 기록)", "오버워치 사령관(이전 기록)",
                "무법자(현상 수배범)", "미국", 185, "미국, 인디애나 블루밍턴",
                "미군(이전 기록)", "오버워치(이전 기록)",
                "#445275 Color #8D9AB4 sRGB Color");
    }

	// 기본 무기
	class BasicWeapon {
		String WaeponExplain = "마우스 우클릭 전자동 돌격 소총입니다.";
		// 탄환 수
		int shot = 30;
		// 재장전 시간
		double duration = 1.5;
		// 공격력 : 발당 19(30m)~5.7(50m)
		double power = 19;
		// 공격 속도: 초당 9발 (DPS: 171)
		int attackSpeed = 9;
		// 치명타 판정: 있음(2배)
		int criticalHit = 2;
	}

	// 생명력(내가 만든거)
	public void WidowmakerHP() {
		int vitality = 200;
		double HP = vitality;
	}

	// 우클릭 - 나선 로켓(Helix Rocket)
	class helixRocket {
		String RightClickExplain = "폭발성 로켓을 발사합니다.";
		// 공격 유형
		String attackType = "투사체(폭발형)";
		// 재사용 대기시간 : 6초
		int CooldownTime = 6;
		// 공격력 : 120(직격), 40~80(폭발)
		int power = 120;
		// 자가 피해: 20~40(폭발)
		int selfDamage = 20;
		// 투사체 속도 50m/s
		int ProjectileSpeed = 50;
		// 폭발 범위: 반경 3m
		int blastRange = 3;
		// 치명타 판정 : 없음
		int CriticalStrike = 0;

	}

	// 좌Shift - 질주(Sprint)
	class Sprint {
		String LeftShiftExplain = "전방을 향해 더 빠르게 뜁니다.";
		// 재사용 대기시간 0초
		int cooldownTime = 0;
		// 이동 속도 증가: 전진 시 50%(본인, 8.25m/s)
		int speedUp = 50;
		// 질주 종료 후 회복 시간: 0.3초
		float recoveryTimeAfterSprinting = (float) 0.3;
	}

	// E - 생체장(Biotic Field)
	class BioticField {
		String EskillExplain = "자신과 아군의 생명력을 회복시키는 장을 생성합니다.";
		// 재사용 대기시간 15초
		int cooldownTime = 15;
		// 지속 시간 : 처치 후 5초
		int duration = 5;
		// 치유량: 초당 40(총 200)
		int healing = 40;
		// 범위: 반경 4.5m
		float range = (float) 4.5;
	}

	// Q - 전술 조준경(Tactical Visor)
	class TacticalVisor {
		String QskillExplain = "시야에 있는 대상들을 자동으로 조준합니다.";
		// 공격 유형
		String attackType = "히트스캔";
		// 궁극기 충전량: 2500 포인트
		double UltimateChargeAmount = 2500;
		// 시전 시간: 1.25초
		float castTime = (float) 1.25;
		// 지속 시간: 6초
		int UltimateDuration = 6;
		// 재장전 속도 증가: 50%
		int increasedReloadSpeed = 50;
		// 최대 거리: 45m
		int maxDistance = 45;
		// 치명타 판정: 있음(2배)
		int criticalHit = 2;

	}

}