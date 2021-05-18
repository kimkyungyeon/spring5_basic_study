package spring5_basic_study.di;

import java.util.Map;

public class MemberListService {
	private MemberDao memberDao;

	public MemberListService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

//	public Map<String, Member> selectAll() {
//	}
}
