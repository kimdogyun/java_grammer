package C07ExceptionFileParsing.MenberException;

import java.util.List;

//핵심로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password) {
//        List(DB)에 이메일이 중복일경우 예외발생
        Member member = memberRepository.findByEmail(email).orElseThrow(()->new IllegalArgumentException("중복된 email"));
//        if (member != null) {
//            throw new IllegalArgumentException("중복된 email입니다");
//        }
//        객체 조립 후 repository를 통해 저장
        Member newMember = null;
        newMember = new Member(name, email, password);
        memberRepository.register(newMember);
    }

    public Member findById(long id) {
        Member member = memberRepository.findById(id);
        if (member == null) {
            // 예외 발생
            throw new IllegalArgumentException("없는 회원");
        }
        return member;
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
    public void login(String email, String password) {
        Member member = memberRepository.findByEmail(email).orElseThrow(()->new IllegalArgumentException("없는 email 입니다"));
//        email이 있는지 확인 후 없으면 예외발생
//        if (member==null) {
//            throw new IllegalArgumentException("없는 email 입니다");
//        }else{
//        password가 일치한지 확인 후 일치하지 않으면 예외 발생
        if (!member.getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다");
        }
        }
    }
