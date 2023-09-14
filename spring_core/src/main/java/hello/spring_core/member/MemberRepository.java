package hello.spring_core.member;

public interface MemberRepository {
    void save(Member memeber);

    Member findByID(Long mebmerId);
}
