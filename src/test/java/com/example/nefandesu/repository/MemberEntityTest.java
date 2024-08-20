//package com.example.nefandesu.repository;
//
//import com.example.nefandesu.entity.Member;
//import com.example.nefandesu.entity.PostComponent.js;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//public class MemberEntityTest {
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @Test
//    public void testGetAllPosts() {
//        // Given
//        Member member = new Member();
//        member.setMemberName("John Doe");
//        member = memberRepository.save(member);
//
//        PostComponent.js post1 = new PostComponent.js();
//        post1.setTitle("Test Title 1");
//        post1.setContent("Test Content 1");
//        post1.setMember(member);
//        postRepository.save(post1);
//
//        PostComponent.js post2 = new PostComponent.js();
//        post2.setTitle("Test Title 2");
//        post2.setContent("Test Content 2");
//        post2.setMember(member);
//        postRepository.save(post2);
//
//        // When
//        List<PostComponent.js> posts = postRepository.findAll();
//
//        // Then
//        assertThat(posts).isNotEmpty();
//        posts.forEach(post -> {
//            System.out.println("PostComponent.js ID: " + post.getId());
//            System.out.println("Title: " + post.getTitle());
//            System.out.println("Content: " + post.getContent());
//            System.out.println("Member ID: " + post.getMember().getId());
//            System.out.println("Member Name: " + post.getMember().getMemberName());
//        });
//    }
//}
