package ch06.di;

public class UserImpl implements User {

	private UserVO[] list;
	private int count;
	
	public UserImpl() {
		allocation(10);
	}
	
	private void allocation(int capacity) {
		UserVO[] temp = new UserVO[capacity];
		
		if(list!=null && count > 0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;
	}
	
	@Override
	public int append(UserVO vo) {
		if(count>=list.length) {
			allocation(list.length+10);
		}
			list[count++] = vo;
		return count;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public UserVO[] getList() {
		return list;
		
	}
	
	
}
