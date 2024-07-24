import Link from "next/link";

export default function Component() {
  return (
    <section className="w-full p-12 md:py-16 lg:py-20">
      <div className="container px-4 md:px-6">
        <div className="flex items-center justify-between mb-6 md:mb-8 lg:mb-10">
          <h2 className="text-2xl md:text-3xl font-bold tracking-tight">All Courses</h2>
          <Link
            href="#"
            className="inline-flex items-center gap-2 text-sm font-medium text-primary hover:text-primary-foreground"
            prefetch={false}
          >
            See All
            <ChevronRightIcon className="w-4 h-4" />
          </Link>
        </div>
        <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4 md:gap-6 lg:gap-8">
          <CourseCard 
            duration="6 Weeks"
            price="$99"
            title="Introduction to Web Development"
            description="Learn the fundamentals of web development, including HTML, CSS, and JavaScript."
            imgSrc="/assets/images/courses.jpeg"
            imgAlt="Course Image"
            link="#"
          />
          <CourseCard 
            duration="8 Weeks"
            price="$149"
            title="React.js Fundamentals"
            description="Dive into the world of React.js and learn how to build interactive user interfaces."
            imgSrc="/assets/images/courses.jpeg"
            imgAlt="Course Image"
            link="#"
          />
          <CourseCard 
            duration="10 Weeks"
            price="$199"
            title="Full-Stack JavaScript Development"
            description="Learn to build full-stack web applications using Node.js, Express, and MongoDB."
            imgSrc="/assets/images/courses.jpeg"
            imgAlt="Course Image"
            link="#"
          />
          <CourseCard 
            duration="12 Weeks"
            price="$249"
            title="Advanced Data Structures and Algorithms"
            description="Dive deep into the world of data structures and algorithms, mastering problem-solving techniques."
            imgSrc="/assets/images/courses.jpeg"
            imgAlt="Course Image"
            link="#"
          />
        </div>
      </div>
    </section>
  );
}

function CourseCard({ duration, price, title, description, imgSrc, imgAlt, link }) {
  return (
    <div className="bg-card rounded-lg overflow-hidden shadow-sm transition-all hover:shadow-md">
      <Link href={link} className="block" prefetch={false}>
        <img
          src={imgSrc}
          alt={imgAlt}
          width={300}
          height={200}
          className="w-full aspect-[3/2] object-cover"
        />
      </Link>
      <div className="p-4 md:p-5">
        <div className="flex items-center justify-between mb-2">
          <span className="text-sm font-medium text-muted-foreground">{duration}</span>
          <span className="text-sm font-medium text-primary">{price}</span>
        </div>
        <h3 className="text-lg md:text-xl font-semibold tracking-tight mb-2">
          <Link href={link} className="hover:text-primary transition-colors" prefetch={false}>
            {title}
          </Link>
        </h3>
        <p className="text-sm text-muted-foreground line-clamp-2">
          {description}
        </p>
      </div>
    </div>
  );
}

function ChevronRightIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <path d="m9 18 6-6-6-6" />
    </svg>
  );
}

function XIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <path d="M18 6 6 18" />
      <path d="m6 6 12 12" />
    </svg>
  );
}
