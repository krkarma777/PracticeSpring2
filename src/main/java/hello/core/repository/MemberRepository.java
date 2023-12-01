package hello.core.repository;

import hello.core.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
