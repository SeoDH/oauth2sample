package com.adonis.test.oauth2server.repository;

import com.adonis.test.oauth2server.dto.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by seodonghyuk on 2016. 12. 20..
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
