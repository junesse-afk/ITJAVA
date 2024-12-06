package com.p3;

import com.p2.아버지;

public class 자식 extends 아버지{

	public void 게임하기() {
		System.out.println("게임을 한다");
	}

	@Override
	public void 노래하기() {
		super.노래하기();
		System.out.println("노래를 아주 잘한다");
	}
}
