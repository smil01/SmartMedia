package ¼÷Á¦;
import java.util.ArrayList;

public class MemberMn {
	private ArrayList<MemberVO> list;

	public MemberMn() {
		list = new ArrayList<MemberVO>();
	}

	public void join(MemberVO vo) {
		list.add(vo);
	}

	public MemberVO login(MemberVO vo) {
		for (MemberVO temp : list) {
			if (temp.getId().equals(vo.getId()) && temp.getPw().equals(vo.getPw())) {
				return temp;
			}
		}
		return null;
	}

	public MemberVO Modify(MemberVO vo) {
		for (int index = 0; index<list.size();index++) {
			if (list.get(index).getId().equals(vo.getId())) {
				list.set(index, vo);
				return list.get(index);
			}
		}
		return null;
	}

}
