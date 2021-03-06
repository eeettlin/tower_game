package gamesrc.Turrets;

import java.awt.Image;

import gamesrc.Bullet;
import gamesrc.Turret;
import gamesrc.Bullets.BulletFour;

public class TurretFour extends Turret {
	public TurretFour(Image image) {
		super(image);
		range = 50;
	
	}

	@Override
	public Bullet createBullet() {
		return new BulletFour();
	}

	@Override
	public double getBulletSpeed() {
		return 30;
	}
}
