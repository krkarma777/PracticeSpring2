package hello.core.member;

import hello.core.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
