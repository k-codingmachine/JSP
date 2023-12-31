package com.saeyan.controller.action;

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("user_main")) {
			action = new UserMainAction();
		}else if(command.equals("user_regi")) {
			action = new UserRegiAction();
		}else if(command.equals("user_list")) {
			action = new UserListAction();
		}
		
		
		
		
		
		return action;
		
	}
	
}
