package myapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import myapp.model.Idea;

public interface IdeaRepository extends PagingAndSortingRepository<Idea,Long>{

	
}
