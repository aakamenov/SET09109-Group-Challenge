package pairsgame

import groovyJCSP.*
import jcsp.lang.*
import java.awt.event.*
import java.awt.event.MouseEvent

class MouseBuffer implements CSProcess {
	ChannelInput mouseEvent
	ChannelInput getPoint
	ChannelOutput sendPoint
	
	void run(){

		
		while(true) {//as soon a mouse event is triggered, is sent to the matcher which will consume it if it is not from the player manager
			println("buffer read mouse event")
			def mEvent = mouseEvent.read()
			if (mEvent.getID() == MouseEvent.MOUSE_PRESSED) {
				def pointValue = mEvent.getPoint()
				def point = [(int)pointValue.x, (int)pointValue.y]
				println("send to matcher")
				sendPoint.write(new MousePoint (point: point))
			}
		}
	
	} // end run
}	
