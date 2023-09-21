package OverWatch;

public class Widowmaker extends OverwatchCharacter {
	
	public Widowmaker() {
        super("Amélie Guillard Lacroix", "아멜리 기야르 라크루아", "여성", 33,
                "발레 무용수(이전 기록)", "암살자", "프랑스", 175,
                "프랑스, 안시", "탈론", "제라르 라크루아(남편)",
                "#8B3F8F Color #C388C5 sRGB Color");
    }
	// 기본 무기
	class BasicWeapon {
		String explain = "마우스 좌클릭 전자동 돌격 소총입니다.";
		String explain1 = "마우스 우클릭 누르고 있으면 원거리에서 저격할 수 있습니다.";
		// 탄환 수
		int shot = 35;
		// 재장전 시간
		double duration = 1.5;

		String explain_Sub = "[기본 발사 - 전자동 돌격 소총] 공격 유형: 히트스캔";
		// 공격력: 발당 13(20m)~3.9(40m))
		double attackPower = 13;
		// 공격 속도 : 초당 10발(DPS : 130)
		double attackSpeed = 10;
		// 치명타 판정 : 있음(2배)
		int CriticalStrike = 2;

		String explain1_Sub = "[보조 발사 - 저격 모드] 공격 유형: 히트스캔";
		// 공격력: 발당 12(최소 충전)~120(최대 충전, 120(40m)~60(60m))
		double attack1_Power = 12;
		// 시전 시간: 0.33초
		float castTime = (float) 0.33;
		// 충전 시간: 최대(100%) 충전까지 0.9초 (DPS: 85.71)
		float chargeTime = (float) 0.9;
		// 발사 후 회복 시간: 0.5초
		float RecoveryTimeAfterFiring = (float) 0.5;
		// 탄환 소모: 회당 5발
		int AmmoConsumption = 5;
		// 저격 모드 중 이동 속도 감소: 65%(본인, 1.925m/s)
		int movementSpeedReductionInSniperMode = 65;
		// 치명타 판정: 있음(2.5배, 최대 300)
		float critical1_Strike = (float) 2.5;

	}

	// 좌Shift - 갈고리 발사
		class GrapplingHook {
			String explain = "자신을 벽으로 끌어당기는 갈고리를 발사합니다.";
			// 재사용 대기시간 12초
			int cooldownTime = 12;
			// 이동 속도: 20m/s
			int speed = 20;
			// 최대 거리: 20m
			int maximumDistance = 20;
		}
		// E - 맹독 지뢰
		class VenomMine {
			String explain = "맹독 덫을 배치합니다.";
			// 공격 유형
			String attackType = "투사체(낙차 있음,폭발형,자가 피해 없음)";
			// 재사용 대기시간
			int CooldownTime = 15;
			// 투사체 속도 20m/s
			int ProjectileSpeed = 20;
			// 중독 지속 시간 5초
			int PoisoningDuration = 5;
			// 공격력 초당 15(총 75 최대 5초)
			int OffensePower = 15;
			// 내구도 1
			int durability = 1;
			// 범위 : 반경3m
			int range = 3;
			// 치명타 없음
			int CriticalStrike = 0;
		}

		// Q - 적외선 투시
		class InflaSight {
			String explain = "적의 위치를 아군에게 노출시킵니다.";
			// 궁극기 충전량: 1540 포인트
			double UltimateChargeAmount = 1540;
			// 지속 시간: 15초
			int UltimateDuration = 15;

		}

}


